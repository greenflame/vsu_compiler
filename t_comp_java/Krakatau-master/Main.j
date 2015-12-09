.version 52 0
.source Main.java
.class super public Main
.super java/lang/Object


.method public <init> : ()V
	; method code size: 5 bytes
	.limit stack 1
	.limit locals 1
	aload_0
	invokespecial java/lang/Object <init> ()V
	return
.end method

.method static public main : ([Ljava/lang/String;)V
	; method code size: 32 bytes
	.limit stack 6
	.limit locals 2
	new Test
	dup
	invokespecial Test <init> ()V
	astore_1
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'Hello, world! [%d]\n'
	iconst_1
	anewarray java/lang/Object
	dup
	iconst_0
	aload_1
	invokevirtual Test run ()I
	invokestatic java/lang/Integer valueOf (I)Ljava/lang/Integer;
	aastore
	invokevirtual java/io/PrintStream printf [_41]
	pop
	return
.end method

.const [_41] = Utf8 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;