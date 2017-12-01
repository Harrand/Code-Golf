i = {1, 2}
for j=3, 10 do
	i[j] = i[j-2] + i[j-1]	
end
for _,v in pairs(i) do print(v) end