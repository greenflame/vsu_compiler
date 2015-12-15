cp out/artifacts/t_comp_java_jar/t_comp_java.jar compiler.jar

echo "[info]: Compiling"
java -jar compiler.jar > /dev/null

echo "[info]: Building assembler"

for f in *.j
do
	echo "[build]: $f"
	python Krakatau-master/assemble.py $f > /dev/null
done

echo "[info]: Build ok"
echo "[info]: Executing"

/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/bin/java -XX:-UseSplitVerifier Root
