List1=[1,3,-6,-8,9,7]
List2=[i for i in List1 if(i>0)];
print(f"positive list={List2}")
list11=[1,2,3,4,5,6]
list12=[i**2 for i in list11]
print(list11)
print(list12)
word=input("Enter a word")
listVowel=[i for i in word if i in 'aeiouAEIOU']
print(f"vowels={listVowel}")
w=input("enter characters")
listOrdinals=[ord(i) for i in w]
print(f"{listOrdinals}")
