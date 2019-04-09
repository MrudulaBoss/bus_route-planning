fname=input('Enter file name: ')
fhand=open(fname)
wlist=list()
for line in fhand :
	line=line.strip()
	words=line.split()
	for e in words :
		if e not in wlist :
			wlist.append(e)
print(wlist.sort())			