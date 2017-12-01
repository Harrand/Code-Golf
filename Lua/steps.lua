s = "0"
c = s
max=100
for i=1,max,1 do
	print(s)
	s = ""
	for j=0,i,1 do
		s = s .. c
	end
end