a=[1,2.2,'python']
print("a=",a)
print(len(a))
a.append('mango')
print("a=",a)
a.remove('mango')
print("a=",a)
b=[10,20,'java']
print("b=",b)
a.extend(b)
print("a and b =",a)
a.reverse()
print("a=",a)
b.insert(1,'abc')
print("b=",b)
a.pop(1)
print("a=",a)
a.pop(-1)
print("a=",a)
c=a.copy()
print("c=",c)
a1=(1,2.2,'python')
print("tuple=",a1)
a2={1,2.2,'python'}
print("set=",a2)
print(type(a))
print(type(a1))
print(type(a2))
