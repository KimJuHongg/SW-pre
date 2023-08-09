#prices 리스트의 원소가 0보다 작은 경웅만 0으로 값을 변경하여 새로운 리스트 mprices를 작성
prices=[135, -545, 922, 356, -992, 217]

mprices = [x if x > 0 else 0 for x in prices ]
#mprices = [0 if prices[x] < 0 else prices[x] for x in range(len(prices))]
print(mprices)


#words 리스트의 각 원소에서 첫문자를 가져와 letters 리스트 생성
words = ["All", "good", "things", "must", "come", "to", "an", "end."]
letters = [i[0] for i in words]
#letters = [words[c][0] for c in range(len(words))]
print(letters)


#num1 = [a,b,c]와 num2 = [x,y,z]의 각 원소를 연결해 numbers = [ax, ay, az, bx, by, bz, cx,cy,cz]를 생성
num1 = ['a', 'b', 'c']
num2 = ['x', 'y', 'z']
numbers = [ i+j for i in ['a', 'b', 'c'] for j in ['x', 'y', 'z'] ]
#numbers = [num1[i]+num2[j] for i in range(len(num1)) for j in range(len(num2))]
print(numbers)
