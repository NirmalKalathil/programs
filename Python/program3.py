s=input("enter word")
print(s)
wordlist=s.split()
print(wordlist)
for i in wordlist:
    print("{i} occurs {wordlist.count(i)}times")
