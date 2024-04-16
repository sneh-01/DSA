def find_missing_element(arr):
    n = len(arr) + 1
    expected_sum = n * (n + 1) // 2
    actual_sum = sum(arr)
    missing_element = expected_sum - actual_sum
    return missing_element

# Example usage:
arr = [1, 2, 4, 6, 3, 7, 8]
missing_element = find_missing_element(arr)
print("Missing element:", missing_element)
