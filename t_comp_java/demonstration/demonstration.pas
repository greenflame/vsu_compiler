program Project1;

{$APPTYPE CONSOLE}

var
	fcall, sumcall, nn : integer;

function f(n : integer) : integer;
var
    q: integer;

    function sum(n : integer) : integer;
    var
        res, res2, i, nnn : integer;

        procedure proc(m: integer);
        begin
          q := m;
        end;

    begin
    	  sumcall := sumcall + 1;
        res := 0;
        i := 1;
        nn := f(n);
        while i <= nn do begin
            res := res + i;
            proc(q + 1);
            i := i + 1;
        end;
        res2 := 0;
        i := 1;
        nnn := f(n);
        while i <= nnn do begin
            res2 := res2 + i;
            proc(q + 1);
            i := i + 1;
        end;
        sum:=res + res2;
    end;

begin
  	fcall := fcall + 1;
  	
    q := 0;

    if n = 1 then
        f := 1
    else
        f := sum(n - 1) + q;
end;

begin
  	fcall := 0;
	  sumcall := 0;
	  
  	write('hello ', f(5), ' ', fcall, ' ', sumcall);

    readln;
end.
