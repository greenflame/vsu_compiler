; ----- Class info -----
.version 51 0
.source Root.java
.class super public Root
.super java/lang/Object

; ----- Fields for function vars -----
.field public nn I
.field public summcall I
.field public fcall I

; ----- Constructor ------
.method  <init> : ()V
	; ----- Call super constructor -----
	aload 0
	invokespecial java/lang/Object <init> ()V
	return
.end method

; ----- Run function -----
.method public run : ()V
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	aload 0
	ldc 0
	putfield Root nn I
	aload 0
	ldc 0
	putfield Root summcall I
	aload 0
	ldc 0
	putfield Root fcall I
	; ----- Body -----
	aload 0
	ldc 0
	putfield Root fcall I
	aload 0
	ldc 0
	putfield Root summcall I
	aload 0
	ldc 0
	putfield Root nn I
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'hello'
	invokevirtual java/io/PrintStream println (Ljava/lang/String;)V
	getstatic java/lang/System out Ljava/io/PrintStream;
	new f
	dup
	aload 0
	invokespecial f <init> (LRoot;)V
	ldc 5
	invokevirtual f run (I)I
	invokevirtual java/io/PrintStream println (I)V
	getstatic java/lang/System out Ljava/io/PrintStream;
	aload 0
	getfield Root fcall I
	invokevirtual java/io/PrintStream println (I)V
	getstatic java/lang/System out Ljava/io/PrintStream;
	aload 0
	getfield Root summcall I
	invokevirtual java/io/PrintStream println (I)V
	return
.end method

.method static public main : ([Ljava/lang/String;)V
	; method code size: 13 bytes
	.limit stack 2
	.limit locals 2
	new Root
	dup
	invokespecial Root <init> ()V
	invokevirtual Root run ()V
	return
.end method

