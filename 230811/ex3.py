#입력 파일에 삼정의 일별 매출(sales.txt)이 저장되어 있다. 이것을 읽어서 일별 평균 매출과 총 매출을 계산한 후에 다른 파일 summary.txt에 출력하는 프로그램 작성
infile = open("C:\\Users\sku\Desktop\sw전문인재\practice\\sales.txt", "r", encoding="utf-8")
outfile = open("C:\\Users\sku\Desktop\sw전문인재\practice\\summary.txt", "w", encoding="utf-8")
count = hap = avg = 0
line = infile.readline().rstrip()

while line != "":
    outfile.writelines(line + "\n")
    hap += int(line)
    line = infile.readline().rstrip()
    count += 1

outfile.writelines("일별 평균 매출:%d원"%(hap/count)+"\n")
outfile.writelines("총 매출:%d원"%hap+"\n")

infile.close()
outfile.close()



