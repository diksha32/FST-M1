x= input("Player 1 add input")
y= input("Player 2 add input")

if x=='rock':
    if y=='scissors':
        print('Player 1 wins')
    else:
        print("Player 2 wins")
elif x=='scissors':
    if y=='rock':
        print("Player 2 wins")
    else:
        print('Player 1 wins')
elif x=='paper':
    if y=='rock':
        print("Player 1 wins")
    else:
        print('Player 2 wins')





