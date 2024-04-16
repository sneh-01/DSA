# we can use hashmap
# we can use sets
# we can use frequency array.  complecity is 0(m+n)

def is_subset(arr1, arr2):
    set1 = set(arr1)
    set2 = set(arr2)
    return set1.issubset(set2)

# Example usage:
arr1 = [1, 2, 3]
arr2 = [1, 2, 3, 4, 5]
result = is_subset(arr1, arr2)
print("Is arr1 a subset of arr2?", result)

