#학생 연락 리스트 구현(list)
def addTel(list):
    name = input("이름 > ")
    tel = input("전화번호 > ")
    list.append([name, tel])
    print(name, "의 전화번호", tel, "이 추가되었습니다")

def deleteTel(list):
    name = input("이름 > ")
    tel = input("전화번호 > ")
    for i in range (0, len(list)):
        #
        if (list[i][0] == name) & (list[i][1] == tel):
            list.remove(list[i])
            print(name, "의 전화번호", tel, "이 삭제되었습니다")
        else:
            print("해당 이름을 가진 전화번호가 없습니다")

def searchTel(list):
    name = input("이름 > ")
    for i in range(0,len(list)):
        if list[i][0] == name:
            print(list[i])
        else:
            print("해당 이름을 가진 전화번호가 없습니다")

def printTel(list):
    print(list)

list = []
while 1:

    print("** 학생 연락 리스트 프로그램 **")
    print("1. 연락처 추가 2. 연락처 삭제 3. 연락처 검색 4. 연락처 출력 5. 종료")
    num = int(input("선택 > "))
    if num == 1:
        addTel(list)

    elif num == 2:
        deleteTel(list)

    elif num == 3:
        searchTel(list)

    elif num == 4:
        printTel(list)

    else:
        break
