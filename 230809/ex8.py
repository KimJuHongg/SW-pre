import turtle as t

def hexagon(length, n):
    t.shape('turtle')
    for i in range(n):
        t.left(720/n)

        for j in range(9):
            t.forward(length)
            t.left(360/n)

    t.done()  # 반드시 실행


hexagon(100, 6)

#------------------------------------------------
# import turtle
# t= turtle.Turtle()
#
# def hexagon():
#     for i in range(6):
#         t.forward(50)
#         t.left(60)
#
# def hexagons():
#     for i in range(6):
#         hexagon()
#         t.forward(50)
#         t.right(60)
#
# hexagons()
