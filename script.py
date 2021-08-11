input = input("Enter integers:")
firstSqBracket = input.find("[")
secondSqBracket = input.find("]")
input = input[firstSqBracket+1:secondSqBracket]
input = input.replace("(", "")
input = input.replace(")", "")

int_list = [int(x) for x in input.split(",")]

dict =  {
}

for i in range(0, len(int_list), 2):
	dict[int_list[i]] = int_list[i+1]

arr = list(dict.keys())

print(arr)
