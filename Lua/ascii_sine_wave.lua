for i=0,100,0.1 do
	s = ""
	f = math.ceil(math.sin(i)*25)
	for j=-25,25,1 do
		if j == f then s = s .. "|" else s = s .. " " end
	end
	print(s)
end