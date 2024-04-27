# def find_out_of_order_pairs(nums):
#     result = []

#     # Iterate through the list until the second to last element
#     for i in range(len(nums) - 1):
#         current_num = nums[i]
#         next_num = nums[i + 1]

#         # Check if the current number is greater than the next number
#         if current_num > next_num:
#             # Append a tuple of indices (index of current_num, index of next_num) to result
#             result.append(i)
#             result.append(i+1)

#     return result  # Return the list of tuples containing indices of out-of-order pairs

# # Test cases
# nums = [1, 2, 3, 0, 4, 5, 6]
# result = find_out_of_order_pairs(nums)

# print(f"Input: {nums}")
# print(f"Output: {result}\n")

def find_missing_min_value(nums):
   
    sorted_nums = sorted(nums)
    
    
    missing_value = 1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    for num in sorted_nums:
        if num == missing_value:
            missing_value += 1
        else:
            break
    
    return [missing_value]


nums = [3, 2, 1, 5, 4, 6]
output = find_missing_min_value(nums)
print("Missing minimum value:", output)


