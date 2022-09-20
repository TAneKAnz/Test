def fibonaci(n) :
    # simple case n = 0, 1
    if n == 0 or n == 1 :
        return n
    # recursive case 2 -> n
    else :
        # f7 = f6 + f5 
        return fibonaci(n-1) + fibonaci(n-2)

print(fibonaci(7))