#학생 연락 리스트 구현(dictionary)

list = {}
def addTel():
    name = input("이름 > ")
    tel = input("전화번호 > ")
    list[name] = tel
    print(name,"님의 전화번호", tel,"이 추가되었습니다")

def deleteTel():
    name = input("이름 > ")
    if name in list:
        del(list[name])
        print(name,"님이 삭제되었습니다.")
    else:
        print(name,"님이 존재하지 않습니다.")

def searchTel():
    name = input("이름 > ")
    if name in list:
        print(name,':',list.get(name))
    else:
        print(name,"님이 존재하지 않습니다")

def printTel():
    if len(list) < 0:
        print("등록된 전화번호가 없습니다")
    else:
        for l in list.keys():
            print("%s : %s" %(l, list[l]))

while True:
    print("** 학생 연락 리스트 프로그램 **")
    print("1. 연락처 추가 2. 연락처 삭제 3. 연락처 검색 4. 연락처 출력 5. 종료")
    num = int(input("선택 > "))
    if num == 1:
        addTel()

    elif num == 2:
        deleteTel()

    elif num == 3:
        searchTel()

    elif num == 4:
        printTel()

    else:
        break
