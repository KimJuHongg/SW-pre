#어떤 회사에서 리스트에 직원들의 월급을 저장하고 있다. 회사에서 일괄적으로 30%의 월급 인상을 하기로 함. 리스트의 모든 요소들을 30% 증가시키는 함수 modify()를 작성
#
# def modify(list):
#     for i in range(0, len(list)):
#         list[i] *= 1.3
#
#     print("인상후",list)
#
#
# list_m = []
#
# a = int(input("리스트의 크기를 입력 > "))
#
# for i in range(0, a):
#     b = int(input("리스트 값 입력 > "))
#     list_m.append(b)
#
# print("인상전", list_m)
# modify(list_m)


salaries =[200, 250, 300, 280, 500]
def modify(values, factor):
    for i in range(len(values)):
        values[i] = values[i] * factor

print("인상 전", salaries)
modify(salaries, 1.3)
print("인상 후", salaries)
