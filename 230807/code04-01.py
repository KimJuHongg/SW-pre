money, c500, c100, c50, c10 = 0, 0, 0, 0, 0

#메인코드
money = int(input("교환할 돈 입력 > "))
c500 = money // 500
money %= 500

c100 = money // 100
money %= 100

c50 = money // 50
money %= 100

print(money)

c10 = money // 10
money %= 10
print("%d개"%c500)
print("%d개"%c100)
print("%d개"%c50)
print("%d개"%c10)
print("바꾸지 못한 돈 %d원"%money)

