-- ȸ����� ���̺� �Է�
insert into t86_4_member_grade values (10, '�ְ������');
insert into t86_4_member_grade values (20, '�߰�������');
insert into t86_4_member_grade values (30, '�۰�');
insert into t86_4_member_grade values (40, '����ȸ��');
insert into t86_4_member_grade values (50, '����ȸ��');
insert into t86_4_member_grade values (60, '�մ�');

-- �帣 ���̺� �Է�
create sequence s86_4_genre;
insert into t86_4_genre 
values (s86_4_genre.nextval, '�ϻ�');
insert into t86_4_genre 
values (s86_4_genre.nextval, '����');
insert into t86_4_genre 
values (s86_4_genre.nextval, '��Ÿ��');
insert into t86_4_genre 
values (s86_4_genre.nextval, '�׼�');
insert into t86_4_genre 
values (s86_4_genre.nextval, '���');
insert into t86_4_genre 
values (s86_4_genre.nextval, '����');
insert into t86_4_genre 
values (s86_4_genre.nextval, '����');
insert into t86_4_genre 
values (s86_4_genre.nextval, '������');
insert into t86_4_genre 
values (s86_4_genre.nextval, '�ô��');
insert into t86_4_genre 
values (s86_4_genre.nextval, '������');

-- ȸ�� ���� ���̺� �Է�
insert into t86_4_member
values ('admin', 'admin', to_date('01-01-1900','dd-mm-yyyy'), '�ְ������', 3, 'admin@t86group4.com', 10);
insert into t86_4_member
values ('admin01', 'admin01', to_date('01-01-1900','dd-mm-yyyy'), '�߰�������', 3, null, 20);
insert into t86_4_member
values ('khmnim84', 'khmnim84', to_date('22-10-1984','dd-mm-yyyy'), '�����', 1, 'khmnim84@naver.com', 30);

-- �۰� ���� ���̺� �Է�
insert into t86_4_writer
values ('khmnim84', '���84');

-- ���� ���̺� �Է�
delete 
create sequence s86_4_webtoon;
insert into t86_4_webtoon values 
(1, 5, 'khmnim84', '������', 0, '�мǿ� ������ ���ƿԴ�!
��ſ� ���� ��Ȱ?! ����?!', to_date('10-06-2014','dd-mm-yyyy'), null, '���п�');
insert into t86_4_webtoon values 
(s86_4_webtoon.nextval, 8, 'khmnim84', 'ȭ����', 0, '820�Ⱓ�� �� �����. ���� ���ο� ���� ���� �ߴ�.
�׸��� ���ο� ������ ���ο� ������� ������.', to_date('11-04-2004','dd-mm-yyyy'), null, '�����');
insert into t86_4_webtoon values 
(s86_4_webtoon.nextval, 4, 'admin01', 'ȭ����', 0, '�ڽ��� ��� ���̾��� �ҳฦ �Ѿ� ž�� ���� �ҳ�
�׸��� �׷� �ҳ��� �����ϴ� ž', to_date('11-03-2003','dd-mm-yyyy'), null, '���� ž');

-- ���� ���� ���̺� �Է�
insert into t86_4_webtoon_sub values
(1, '���п�', 1, '���ѷα�', '���п� ���ѷα� ����', to_date('10-06-2014','dd-mm-yyyy'), null, null);
insert into t86_4_webtoon_sub values
(2, '���п�', 1, '���ѷα�', '���п� ���ѷα� ����', to_date('10-06-2014','dd-mm-yyyy'), null, null);
insert into t86_4_webtoon_sub values
(3, '���п�', 1, '���ѷα�', '���п� ���ѷα� ����', to_date('10-06-2014','dd-mm-yyyy'), null, null);
