

while True:
    x = input("Player 1 add input").lower()

    y = input("Player 2 add input").lower()

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
    else:
        print("Invalid input, please try again")

    repeat=input("Do you want to play another round? Type: Yes/No").lower()

    if(repeat=='yes'):
        pass
    elif(repeat=='no'):
        raise SystemExit





