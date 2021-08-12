userInput = input("input : ")
firstBracket = userInput.find("(")
dict = {}
while (firstBracket != -1):
    firstBracket = userInput.find("(")
    secondBracket = userInput.find(")")
    sep = userInput.find(",")
    firstNum = userInput[firstBracket+1:sep]
    secondNum = userInput[sep+1:secondBracket]
    dict[firstNum]=secondNum
    userInput = userInput[secondBracket+2:]
return dict
