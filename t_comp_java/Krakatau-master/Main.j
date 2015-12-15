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
	; method code size: 48 bytes
	.limit stack 2
	.limit locals 4
	iconst_2
	istore_1
	iconst_3
	istore_2
	iload_1
	iload_2
	if_icmpge L13
	iconst_1
	goto L14
L13:
.stack append
	locals Integer Integer
.end stack
	iconst_0
L14:
.stack same_locals_1_stack_item
	stack Integer
.end stack
	istore_3
	iload_1
	iload_2
	if_icmpge L31
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'Hello!'
	invokevirtual java/io/PrintStream println (Ljava/lang/String;)V
	goto L39
L31:
.stack append
	locals Integer
.end stack
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'Goodby!'
	invokevirtual java/io/PrintStream println (Ljava/lang/String;)V
L39:
.stack same
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'Later!'
	invokevirtual java/io/PrintStream println (Ljava/lang/String;)V
	return
.end method

.method static public t : ()V
	; method code size: 17 bytes
	.limit stack 3
	.limit locals 1
	new Test
	dup
	aconst_null
	invokespecial Test <init> (LTest;)V
	astore_0
	aload_0
	bipush 12
	invokevirtual Test run (I)I
	pop
	return
.end method
