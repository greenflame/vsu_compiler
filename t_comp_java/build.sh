# File to compile
file="demonstration.c";

# Run compiler with java 8
echo "[info]: Compiling"
java -jar compiler.jar $file;

# Build assembly
echo "[info]: Building assembler"
for f in *.j
do
	echo "[build]: $f"
	python Krakatau-master/assemble.py $f > /dev/null
done

# Run root class with java 7 using flag -XX:-UseSplitVerifier
echo "[info]: Executing"
/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/bin/java -XX:-UseSplitVerifier Root
