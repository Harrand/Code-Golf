-- pi/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ... gregory-leibniz series converges after ~300 times. did alot more.
p = 1
b = 1
for i=3,1000000,2 do
	v = (1/i)
	if b==1 then p=p-v else p=p+v
	end
	b = -b
end
print(4*p)