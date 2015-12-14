echo "----------- Build started -------------"

for f in *.j
do
	echo "----- Processing $f"
	python Krakatau-master/assemble.py $f
done

java Root