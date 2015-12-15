echo "[info]: Build stared"

for f in *.j
do
	echo "[build]: $f"
	python Krakatau-master/assemble.py $f > /dev/null
done

echo "[info]: Build ok"
echo "[info]: Executing"

java Root
