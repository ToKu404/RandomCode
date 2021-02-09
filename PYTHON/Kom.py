n = 6
k = 3

c[][] = [n][k]
for i in range(n):
  for j in range(i):
    if i==j or j==0:
      c[i][j]=1
    else:
      c[i][j] = c[i-1][j-1]+c[i-1][j]
    if j==k:
      break

print(c[n,k])