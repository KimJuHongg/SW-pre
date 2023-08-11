#은행에서 대출을 받을 때 은행마다 대출 이자가 다름 이것을 메소드 오버라이딩으로 구현
#고객은 vip, gold, silver 등급일때 대출 이율을 할인 받음
#BadBank의 이자율 10.0    NormalBank의 이자율 5.0     GoodBank의 이자율 3.0

#각 등급별로 대출 이율의 할인율 : VIP(5), Gold(2), Silver(0)
#1) 홍길동 VIP 천만원 NormalBank  2)이길동 Gold 5천만원 GoodBank    3)김깅동 Silver 2천만원 BadBank

class Bank:
    def __init__(self, name, grade, money):
        self.name = name
        self.grade = grade
        self.money = money

    def getInterestRate():
        pass

class BadBank(Bank): #10%
    def __init__(self, name, grade, money, InterestRate=0.1):
        super().__init__(name, grade, money)
        self.InterestRate = InterestRate

    def getInterestRate(self):
        return self.InterestRate*self.money

class NormalBank(Bank): #5%
    def __init__(self, name, grade, money, InterestRate=0.05):
        super().__init__(name, grade, money)
        self.InterestRate = InterestRate

    def getInterestRate(self):
        return self.InterestRate*self.money

class GoodBank(Bank): #3%
    def __init__(self, name, grade, money, InterestRate=0.03):
        super().__init__(name, grade, money)
        self.InterestRate=InterestRate

    def getInterestRate(self):
        return self.InterestRate*self.money


def main():
    name = input("이름 입력 > ")
    grade = input("등급 입력 > ")
    money = input("대출 금액 입력 > ")
    bank = input("이용 은행 이름 입력(BadBank/NormalBank/GoodBank) >")

    if bank == 'BadBank':
        discount = BadBank(name, grade, money)

    elif bank == 'NormalBank':
        discount = NormalBank(name, grade, money)

    elif bank == 'GoodBank':
        discount = GoodBank(name, grade, money)

    InterestRate = discount.getInterestRate()

    if grade == 'VIP':  #5%할인
        finalMoney = InterestRate*0.95
    elif grade == 'Gold':   #2%할인
        finalMoney = InterestRate*0.98
    elif grade == 'Silver':  #할인x
        finalMoney = InterestRate

    print("%s님의 최종 이자 : %d원"%(name, int(finalMoney)))

main()
