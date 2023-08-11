#회사에 직원(Employee)과 매니저(Manager)가 있다. 직원은 월급만 있지만 매니저는 월급 외에 보너스가 있다ㄱ 하자. Employee클래스를 상속받아서 Manager클래스를 작성한다. Employee 클래스의 getSalary()는
#Manager클래스에서 재정의된다.

class Employee:
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary

    def getInfo(self):
        return "이름 : " + str(self.name) + ",월급 : " + str(self.salary)

class Manager:
    def __init__(self, name, salary, bonus):
        super().__init__(name, salary)
        self.bonus = bonus

    def getInfo(self):
        return super().getInfo() + ", 보너스 : " + str(self.bonus)

def main():
    m1 = Manager("김철수", 2000000, 100000)
    print(m1.getInfo())

main()
