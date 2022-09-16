from logic import *

rain = Symbol("rain")
hagrid = Symbol("hagrid")
dumbledore = Symbol("dumbledore")

knowledge = And(
    Implication(Not(rain), hagrid),
    Or(hagrid, dumbledore),
    Not(And(hagrid, dumbledore)),
    dumbledore
)

sentence = And(rain, hagrid)
print(sentence.formula())

print(model_check(knowledge, rain))
print(knowledge.symbols())
if not knowledge.symbols() :
    print(1)
else :
    print(2)

remaining = knowledge.symbols().copy()
p = remaining.pop()
print(remaining)

model_true = dict()
model_true[p] = True
print(model_true)

model_false = dict()
model_false[p] = False
print(model_false)
print("--------------------")

def check_all(knowledge, query, symbols, model):
        """Checks if knowledge base entails query, given a particular model."""

        # If model has an assignment for each symbol
        if not symbols:

            # If knowledge base is true in model, then query must also be true
            print(model)
            if knowledge.evaluate(model):
                print(query.evaluate(model))
                return query.evaluate(model)
            print(True)
            return True
        else:

            # Choose one of the remaining unused symbols
            remaining = symbols.copy()
            p = remaining.pop()

            # Create a model where the symbol is true
            model_true = model.copy()
            model_true[p] = True

            # Create a model where the symbol is false
            model_false = model.copy()
            model_false[p] = False

            # Ensure entailment holds in both models
            print(model)
            return (check_all(knowledge, query, remaining, model_true) and
                    check_all(knowledge, query, remaining, model_false))

#print(check_all(knowledge, rain, knowledge.symbols(), dict()))

def evaluate(self, model):
        return all(conjunct.evaluate(model) for conjunct in self.conjuncts)

print(knowledge.evaluate({'dumbledore': True, 'hagrid': False, 'rain': True}))