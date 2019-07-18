drop table struts03;
drop sequence struts03_seq;

create table struts03(
	num number primary key,
	sub varchar2(50),
	content varchar2(1024)
);
create sequence struts03_seq;

insert into struts03 values(struts03_seq.nextval, 'test1','test');
insert into struts03 values(struts03_seq.nextval, 'test2','test');
insert into struts03 values(struts03_seq.nextval, 'test3','test');
insert into struts03 values(struts03_seq.nextval, 'test4','test');
insert into struts03 values(struts03_seq.nextval, 'test5','test');

commit;

--select num, sub from struts03 order by num desc; --목록
--select num, sub, content from struts03 where num = ?; --상세
--insert into struts03 values(struts03_seq.nextval,?,?); --입력쿼리

