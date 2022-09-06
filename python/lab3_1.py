class Stack :
    def __init__(self, items = None) :
        if items == None :
            self.items = []
        else :
            self.items = items

    def push(self, data) :
        self.items.append(data)

    def pop(self) :
        return self.items.pop()

    def size(self) :
        return len(self.items)

    def isEmpty(self) :
        return self.items == []

s = Stack()
n = input("Enter Input : ").split(',')
m = []
for x in n :
    m.append(x.split())
for x in m :
    if x[0] == 'A' :
        s.push(x[1])
        print("Add = {} and Size = {}".format(x[1], s.size()))
    elif x[0] == 'P' :
        if s.isEmpty() :
            print(-1)
        else :
            print("Pop = {} and Index = {}".format(s.pop(), s.size()))
print("Value in Stack = ",end='')
if s.isEmpty() :
    print("Empty")
else :
    for x in s.items :
        print(x, end=' ')
            
    