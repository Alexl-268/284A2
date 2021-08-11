def _mergeSort(arr, temp_arr, left, right):

	inv_count = 0
	if left < right:
		mid = (left + right)//2

		inv_count += _mergeSort(arr, temp_arr, left, mid)
		inv_count += _mergeSort(arr, temp_arr, mid + 1, right)
		inv_count += merge(arr, temp_arr, left, mid, right)

	return inv_count

def merge(arr, temp_arr, left, mid, right):
	i = left	 # Starting index of left subarray
	j = mid + 1  # Starting index of right subarray
	k = left	 # Starting index of to be sorted subarray
	inv_count = 0

	while i <= mid and j <= right:
		if arr[i] <= arr[j]:
			temp_arr[k] = arr[i]
			k += 1
			i += 1
		else:
			# Inversion will occur.
			temp_arr[k] = arr[j]
			inv_count += (mid-i + 1)
			k += 1
			j += 1

	while i <= mid:
		temp_arr[k] = arr[i]
		k += 1
		i += 1

	while j <= right:
		temp_arr[k] = arr[j]
		k += 1
		j += 1

	for loop_var in range(left, right + 1):
		arr[loop_var] = temp_arr[loop_var]

	return inv_count

scenario = input("numbers : ")


def formattedArray():
	userInput = input("input : ")
	firstSqBracket = userInput.find("[")
	secondSqBracket = userInput.find("]")
	userInput = userInput[firstSqBracket+1:secondSqBracket]
	userInput = userInput.replace("(", "")
	userInput = userInput.replace(")", "")

	return userInput

final = []
scenario = int(scenario)
while (scenario > 0):
	userInput = formattedArray()
	if (userInput != ""):
		int_list = [int(x) for x in userInput.split(",")]

		dict = {
		}

		for i in range(1, len(int_list), 2):
			dict[int_list[i-1]] = int_list[i]

		keys = list(sorted(dict.keys()))

		arrToCount = []
		for i in keys :
			arrToCount.append(dict.get(i))

		n= len(arrToCount)
		temp_arr = [0]*n
		result = _mergeSort(arrToCount, temp_arr, 0, n-1)
		final.append(result)
	else:
		final.append(0)
	
	scenario = scenario - 1

for i in final:
	print(i)