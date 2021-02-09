# Untuk A
A = [8, 7, 0, 1, 3, 2, 5, 4, 6]
cross = 0
for i in range(len(A)-1):
    for j in range(i+1,len(A)):
        if(A[i]>A[j]):
            cross += 1
            print(A[i],"------------",A[j])
print("\nJumlah Cross A = ",cross)

# Untuk B
B = [0, 2, 4, 6, 8, 10, 12, 1, 3, 5, 7, 9, 11, 13]
cross = 0
for i in range(len(B)-1):
    for j in range(i+1, len(B)):
        if(B[i] > B[j]):
            cross += 1
            print(B[i], "------------", B[j])
print("\nJumlah Cross B = ", cross)
