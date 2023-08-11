infile = open("C:\\Users\sku\Desktop\sw전문인재\practice\\input.txt", "r", encoding="utf-8")
ch = infile.read(1)
while ch != "":
    print(ch)
    ch = infile.read(1)

infile.close()
