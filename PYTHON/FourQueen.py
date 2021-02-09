# Python program for above approach
import math
ways = 0

# Program to solve N-Queens Problem
def solveBoard(board, row, rowmask, 
							ldmask, rdmask):

	n = len(board)
	
	# All_rows_filled is a bit mask 
	# having all N bits set
	all_rows_filled = (1 << n) - 1
	
	# If rowmask will have all bits set, means
	# queen has been placed successfully
	# in all rows and board is diplayed
	if (rowmask == all_rows_filled):
		global ways
		ways = ways + 1
		print("=====================")
		print("Queen placement - " + (str)(ways))
		print("=====================")
		printBoard(board)
		
	# We extract a bit mask(safe) by rowmask,
	# ldmask and rdmask. all set bits of 'safe' 
	# indicates the safe column index for queen
	# placement of this iteration for row index(row).
	safe = all_rows_filled & (~(rowmask | 
								ldmask | rdmask))
	
	while (safe > 0):
	
		# Extracts the right-most set bit
		# (safe column index) where queen 
		# can be placed for this row
		p = safe & (-safe)
		col = (int)(math.log(p)/math.log(2))
		board[row][col] = 'Q'
		
		# This is very important:
		# we need to update rowmask, ldmask and rdmask 
		# for next row as safe index for queen placement
		# will be decided by these three bit masks.

		# We have all three rowmask, ldmask and 
		# rdmask as 0 in beginning. Suppose, we are placing
		# queen at 1st column index at 0th row. rowmask, ldmask
		# and rdmask will change for next row as below:

		# rowmask's 1st bit will be set by OR operation
		# rowmask = 00000000000000000000000000000010

		# ldmask will change by setting 1st
		# bit by OR operation and left shifting 
		# by 1 as it has to block the next column
		# of next row because that will fall on left diagonal.
		# ldmask = 00000000000000000000000000000100 

		# rdmask will change by setting 1st bit 
		# by OR operation and right shifting by 1
		# as it has to block the previous column
		# of next row because that will fall on right diagonal.
		# rdmask = 00000000000000000000000000000001

		# these bit masks will keep updated in each 
		# iteration for next row
		solveBoard(board, row+1, rowmask|p, 
						(ldmask|p) << 1, (rdmask|p) >> 1)
		
		# Reset right-most set bit to 0 so, next 
		# iteration will continue by placing the queen
		# at another safe column index of this row
		safe = safe & (safe-1)
		
		# Backtracking, replace 'Q' by ' '
		board[row][col] = ' '

# Program to print board
def printBoard(board):
	for row in board:
		print("|" + "|".join(row) + "|")

# Driver Code	 
def main():

	n = 5; # board size
	board = []
	
	for i in range (n):
		row = []
		for j in range (n):
			row.append(' ')
		board.append(row)

	rowmask = 0
	ldmask = 0
	rdmask = 0
	row = 0
	
	# Function Call
	solveBoard(board, row, rowmask, ldmask, rdmask)
	
	# creates a new line
	print() 
	print("Number of ways to place " + (str)(n) +
						" queens : " + (str)(ways))
	
if __name__== "__main__":
	main()

#This code is contributed by Nikhil Vinay
