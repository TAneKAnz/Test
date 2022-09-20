arr = [1, 3, 4, 5, 17, 18, 31, 33, 35]

def binarySearchIt(low, high, key) :
    while low <= key :
        mid = int((low + high) / 2)
        if key == arr[mid] :
            return mid
        elif key > arr[mid] :
            low = mid + 1
        else :
            high = mid - 1
    return(-1)

def binarySearchRe(low, high, key) :
    mid = int((low + high) / 2)
    # base case -> mid = key
    if high < low :
        return(-1)
    if arr[mid] == key :
        return mid
    # recursive case
    elif key > arr[mid] :
        return binarySearchRe(mid+1, high, key)
    else :
        return binarySearchRe(low, mid-1, key)

print(binarySearchIt(0, len(arr)-1, 18))
print(binarySearchRe(0, len(arr)-1, 18))
