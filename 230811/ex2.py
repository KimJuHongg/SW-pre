#판매 관리하는 프로그램을 상속과 다형성을 구현해 작성
#1. 고객축가 2. 상품판매 3. 조회 4. 전체회원출력 5. 삭제 6. 종료
#조회는 고객의 이름을 입력하면 보너스 포인트를 출력, 삭제 : 이름 입력시 삭제, 상품 판매를 선택하면 고객의 이름, 상품가격을 입력해 고객이 지불할 금액(할인율 적용)과 누적된 자신의 보너스 포인트 출력

class Customer:
    def __init__(self, id, name, grade, bonuspoint = 0):
        self.id = id
        self.name = name
        self.grade = grade

    def show(self):
        print("이름:%s, 등급:%s, 보너스포인트:%d"%(self.name,self.grade,self.bonuspoint))

    def calcPrice(price):
        print("상품 가격:%d"%price)

class SilverCustomer(Customer):
    bonuspoint=0
    bonusRatio=0.1
    def __init__(self, id, name, grade, bonuspoint=0, bonusRatio=0.1):
        super().__init__(self, name, id, grade)

    def show(self):
        super().show()

    def calcPrice(self, price):
        print("상품 가격:%d"%price)
        self.bonuspoint += price*self.bonusRatio

class GoldCustomer(Customer):
    bonuspoint=0
    bonusRatio=0.2
    saleRatio=0.1
    def __init__(self, id, name, grade, bonuspoint=0, bonusRatio=0.1, saleRatio=0.1):
        super().__init__(self, name, id, grade)

    def show(self):
        print("이름:%s, 등급:%s, 보너스포인트:%d"%(self.name, self.grade, self.bonuspoint))

    def calcPrice(self, price):
        print("상품 가격:%d"%int(price*(1-self.saleRatio)))
        self.bonuspoint += price * self.bonusRatio

class VIPCustomer(Customer):
    bonuspoint=0
    bonusRatio=0.5
    saleRatio = 0.2

    def __init__(self, id, name, grade, bonuspoint=0, bonusRatio=0.1, saleRatio = 0.2):
        super().__init__(self, name, id, grade)

    def show(self):
        super().show()

    def calcPrice(self, price):
        print("상품 가격:%d"%int(price*(1-self.saleRatio)))
        self.bonuspoint += price*self.bonusRatio

def main():
    customer1 = SilverCustomer("이숭신", "100", "silver")
    customer2 = GoldCustomer("홍길동", "200", "gold")
    customer3 = VIPCustomer("김유신", "300", "vip")

    customer1.show()
    customer2.show()
    customer3.show()

    customer1.calcPrice(20000)
    customer2.calcPrice(20000)
    customer3.calcPrice(20000)

    customer1.show()
    customer2.show()
    customer3.show()

main()

