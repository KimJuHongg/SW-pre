#앞에서부터 읽을때와 뒤에서부터 읽을 때 똑같은 단어 또는 문장을 팰린드롬이라고 함 ex)racecar,noon
#소문자 알파벳, 공백(" "), 그리고 마침표로 이루어진 문장이 팰린드롬 문장인지 점검하려고 하는데 문장 내에서 알파벳만 추출하였을때에 팰린드롬 단어이면 팰린드롬 문자임
#소문자 알파벳, 공백(" "), 그리고 마침표(".")로 이루어진 문장 sentence가 주어질 때 팰린드롬인지 아닌지를 return 하도록 solution함수를 작성

sentence = "nev,er, od,d or e,ven"

def solution(stc):
    strList = [c for c in list(stc) if str.isalpha(c)]

    for i in range(len(strList)):
        if(strList[i] != strList[ -(i+1) ]):
            return False
    return True

if solution(sentence):
    print("팰린드롬O")
else:
    print("팰린드롬X")

#-----------------------------------------------------------------------

def solution(sentence):
    str = ""
    restr=""
    lowersentence=sentence.lower()
    for i in range(len(lowersentence)):
        #공백이나 마침표가아닐때만
        if lowersentence[i] != " " and lowersentence[i] != ".":
            str += lowersentence[i]
    #reverser
    for i in range(len(str)-1,-1,-1):
        restr += str[i]

    if str == restr:
        return True
    else:
        return False
