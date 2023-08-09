dic1 = {1: 'a', 2: 'b', 3:'c'}
print(dic1)

student = {'학번' : 1000, '이름' : '홍길동', '학과' : '컴퓨터학과'}
print(student)

student['연락처'] = '010-1234-5678'
print(student)

student['학과'] = '파이썬학과'
print(student)

del(student['학과'])
print(student)

print(student['이름'])
print(student.get('이름'))

print(student.keys())

print(list(student.keys()))

print(student.values())

print(student.items())

print('이름' in student)
print('주소' in student)

print("------------------------------------------------------------------------------")
singer = {}

singer['이름'] = '트와이스'
singer['구성원 수'] = 9
singer['데뷔'] = '서바이벌 식스틴'
singer['대표곡'] = 'SIGNAL'

for k in singer.keys():
    print('%s --> %s' %(k, singer[k]))

print("------------------------------------------------------------------------------")

dic = {i:str(i) for i in [1,2,3,4,5]}
print(dic)

fruits=["apple","orange","banana"]

dic={f:len(f) for f in fruits}
print(dic)

