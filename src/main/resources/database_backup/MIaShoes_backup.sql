PGDMP  )            
        }            miashoes_pos    17.0    17.0 7               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false            	           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false            
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false                       1262    41321    miashoes_pos    DATABASE     ~   CREATE DATABASE miashoes_pos WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Peru.1252';
    DROP DATABASE miashoes_pos;
                     postgres    false            �            1255    41596 !   buscar_calzado(character varying)    FUNCTION     g  CREATE FUNCTION public.buscar_calzado(p_referencia character varying) RETURNS TABLE(codigo_barra character varying, referencia character varying, color character varying, material character varying, talla integer, stock integer, marca character varying, precio_sugerido numeric)
    LANGUAGE plpgsql
    AS $$
Begin
	return query
	SELECT c.codigo_barra, c.referencia, c.color, c.material, c.talla, c.stock,
           m.nombre_marca as marca, c.precio_sugerido 
    FROM calzado c
    JOIN marca m ON c.marca_id = m.id_marca
    WHERE c.referencia = p_referencia
    ORDER BY c.color, c.material, c.talla;
END;
$$;
 E   DROP FUNCTION public.buscar_calzado(p_referencia character varying);
       public               postgres    false            �            1255    49514 +   buscar_calzado_por_barra(character varying)    FUNCTION     R  CREATE FUNCTION public.buscar_calzado_por_barra(p_codigo_barra character varying) RETURNS TABLE(codigo_barra character varying, referencia character varying, color character varying, material character varying, talla integer, stock integer, nombre_marca character varying, precio_sugerido numeric)
    LANGUAGE plpgsql
    AS $$
BEGIN
    RETURN QUERY 
    SELECT c.codigo_barra, c.referencia, c.color, c.material, c.talla, c.stock, 
           m.nombre_marca, c.precio_sugerido
    FROM calzado c
    JOIN marca m ON c.marca_id = m.id_marca
    WHERE c.codigo_barra = p_codigo_barra;
END;
$$;
 Q   DROP FUNCTION public.buscar_calzado_por_barra(p_codigo_barra character varying);
       public               postgres    false            �            1259    41477    calzado    TABLE     6  CREATE TABLE public.calzado (
    codigo_barra character varying(30) NOT NULL,
    referencia character varying(30),
    stock integer NOT NULL,
    color character varying(50),
    material character varying(30),
    marca_id integer NOT NULL,
    precio_sugerido numeric(10,2),
    talla integer NOT NULL
);
    DROP TABLE public.calzado;
       public         heap r       postgres    false            �            1259    41328    cliente    TABLE     �   CREATE TABLE public.cliente (
    dni_cliente character varying(10) NOT NULL,
    nombre_cliente character varying(50) NOT NULL,
    nro_telef character varying(20)
);
    DROP TABLE public.cliente;
       public         heap r       postgres    false            �            1259    41577    detallefacturacion    TABLE     �   CREATE TABLE public.detallefacturacion (
    id_detalle integer NOT NULL,
    factura_id character varying(30) NOT NULL,
    calzado_id character varying(30) NOT NULL
);
 &   DROP TABLE public.detallefacturacion;
       public         heap r       postgres    false            �            1259    41576 !   detallefacturacion_id_detalle_seq    SEQUENCE     �   ALTER TABLE public.detallefacturacion ALTER COLUMN id_detalle ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.detallefacturacion_id_detalle_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public               postgres    false    231            �            1259    41516    detalleseparado    TABLE       CREATE TABLE public.detalleseparado (
    id_detalle_separado integer NOT NULL,
    separado_id integer NOT NULL,
    calzado_barra character varying(30) NOT NULL,
    cantidad integer NOT NULL,
    descuento integer,
    adelanto numeric(10,2) NOT NULL
);
 #   DROP TABLE public.detalleseparado;
       public         heap r       postgres    false            �            1259    41515 '   detalleseparado_id_detalle_separado_seq    SEQUENCE     �   ALTER TABLE public.detalleseparado ALTER COLUMN id_detalle_separado ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.detalleseparado_id_detalle_separado_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public               postgres    false    228            �            1259    41488    detalleventa    TABLE       CREATE TABLE public.detalleventa (
    id_detalle_venta integer NOT NULL,
    venta_id integer NOT NULL,
    calzado_barra character varying(30) NOT NULL,
    cantidad integer NOT NULL,
    descuento numeric(10,2),
    precio_final numeric(10,2) NOT NULL
);
     DROP TABLE public.detalleventa;
       public         heap r       postgres    false            �            1259    41487 !   detalleventa_id_detalle_venta_seq    SEQUENCE     �   ALTER TABLE public.detalleventa ALTER COLUMN id_detalle_venta ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.detalleventa_id_detalle_venta_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public               postgres    false    226            �            1259    41531    facturacion    TABLE     �   CREATE TABLE public.facturacion (
    id_factura character varying(30) NOT NULL,
    marca_id integer NOT NULL,
    fecha_emision date
);
    DROP TABLE public.facturacion;
       public         heap r       postgres    false            �            1259    41323    marca    TABLE     n   CREATE TABLE public.marca (
    id_marca integer NOT NULL,
    nombre_marca character varying(20) NOT NULL
);
    DROP TABLE public.marca;
       public         heap r       postgres    false            �            1259    41322    marca_id_marca_seq    SEQUENCE     �   ALTER TABLE public.marca ALTER COLUMN id_marca ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.marca_id_marca_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public               postgres    false    218            �            1259    41455    separado    TABLE     �   CREATE TABLE public.separado (
    id_separado integer NOT NULL,
    dni_id character varying(10),
    monto numeric(10,2) NOT NULL,
    fecha_separado timestamp without time zone DEFAULT now(),
    estado character varying(15) NOT NULL
);
    DROP TABLE public.separado;
       public         heap r       postgres    false            �            1259    41454    separado_id_separado_seq    SEQUENCE     �   ALTER TABLE public.separado ALTER COLUMN id_separado ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.separado_id_separado_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public               postgres    false    223            �            1259    41443    venta    TABLE     �   CREATE TABLE public.venta (
    id_venta integer NOT NULL,
    dni_id character varying(10),
    monto numeric(10,2),
    fecha_venta timestamp without time zone DEFAULT now(),
    nro_serie character varying(20) NOT NULL
);
    DROP TABLE public.venta;
       public         heap r       postgres    false            �            1259    41442    venta_id_venta_seq    SEQUENCE     �   ALTER TABLE public.venta ALTER COLUMN id_venta ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.venta_id_venta_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public               postgres    false    221            �          0    41477    calzado 
   TABLE DATA           u   COPY public.calzado (codigo_barra, referencia, stock, color, material, marca_id, precio_sugerido, talla) FROM stdin;
    public               postgres    false    224   �I       �          0    41328    cliente 
   TABLE DATA           I   COPY public.cliente (dni_cliente, nombre_cliente, nro_telef) FROM stdin;
    public               postgres    false    219   	K                 0    41577    detallefacturacion 
   TABLE DATA           P   COPY public.detallefacturacion (id_detalle, factura_id, calzado_id) FROM stdin;
    public               postgres    false    231   ?K                 0    41516    detalleseparado 
   TABLE DATA           y   COPY public.detalleseparado (id_detalle_separado, separado_id, calzado_barra, cantidad, descuento, adelanto) FROM stdin;
    public               postgres    false    228   �K                  0    41488    detalleventa 
   TABLE DATA           t   COPY public.detalleventa (id_detalle_venta, venta_id, calzado_barra, cantidad, descuento, precio_final) FROM stdin;
    public               postgres    false    226   �K                 0    41531    facturacion 
   TABLE DATA           J   COPY public.facturacion (id_factura, marca_id, fecha_emision) FROM stdin;
    public               postgres    false    229   L       �          0    41323    marca 
   TABLE DATA           7   COPY public.marca (id_marca, nombre_marca) FROM stdin;
    public               postgres    false    218   LL       �          0    41455    separado 
   TABLE DATA           V   COPY public.separado (id_separado, dni_id, monto, fecha_separado, estado) FROM stdin;
    public               postgres    false    223   �L       �          0    41443    venta 
   TABLE DATA           P   COPY public.venta (id_venta, dni_id, monto, fecha_venta, nro_serie) FROM stdin;
    public               postgres    false    221   M                  0    0 !   detallefacturacion_id_detalle_seq    SEQUENCE SET     P   SELECT pg_catalog.setval('public.detallefacturacion_id_detalle_seq', 32, true);
          public               postgres    false    230                       0    0 '   detalleseparado_id_detalle_separado_seq    SEQUENCE SET     V   SELECT pg_catalog.setval('public.detalleseparado_id_detalle_separado_seq', 1, false);
          public               postgres    false    227                       0    0 !   detalleventa_id_detalle_venta_seq    SEQUENCE SET     P   SELECT pg_catalog.setval('public.detalleventa_id_detalle_venta_seq', 1, false);
          public               postgres    false    225                       0    0    marca_id_marca_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.marca_id_marca_seq', 16, true);
          public               postgres    false    217                       0    0    separado_id_separado_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.separado_id_separado_seq', 1, false);
          public               postgres    false    222                       0    0    venta_id_venta_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.venta_id_venta_seq', 1, false);
          public               postgres    false    220            S           2606    41481    calzado calzado_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.calzado
    ADD CONSTRAINT calzado_pkey PRIMARY KEY (codigo_barra);
 >   ALTER TABLE ONLY public.calzado DROP CONSTRAINT calzado_pkey;
       public                 postgres    false    224            M           2606    41332    cliente cliente_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (dni_cliente);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public                 postgres    false    219            [           2606    41581 *   detallefacturacion detallefacturacion_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.detallefacturacion
    ADD CONSTRAINT detallefacturacion_pkey PRIMARY KEY (id_detalle);
 T   ALTER TABLE ONLY public.detallefacturacion DROP CONSTRAINT detallefacturacion_pkey;
       public                 postgres    false    231            W           2606    41520 $   detalleseparado detalleseparado_pkey 
   CONSTRAINT     s   ALTER TABLE ONLY public.detalleseparado
    ADD CONSTRAINT detalleseparado_pkey PRIMARY KEY (id_detalle_separado);
 N   ALTER TABLE ONLY public.detalleseparado DROP CONSTRAINT detalleseparado_pkey;
       public                 postgres    false    228            U           2606    41492    detalleventa detalleventa_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.detalleventa
    ADD CONSTRAINT detalleventa_pkey PRIMARY KEY (id_detalle_venta);
 H   ALTER TABLE ONLY public.detalleventa DROP CONSTRAINT detalleventa_pkey;
       public                 postgres    false    226            Y           2606    41571    facturacion facturacion_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.facturacion
    ADD CONSTRAINT facturacion_pkey PRIMARY KEY (id_factura);
 F   ALTER TABLE ONLY public.facturacion DROP CONSTRAINT facturacion_pkey;
       public                 postgres    false    229            K           2606    41327    marca marca_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.marca
    ADD CONSTRAINT marca_pkey PRIMARY KEY (id_marca);
 :   ALTER TABLE ONLY public.marca DROP CONSTRAINT marca_pkey;
       public                 postgres    false    218            Q           2606    41460    separado separado_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.separado
    ADD CONSTRAINT separado_pkey PRIMARY KEY (id_separado);
 @   ALTER TABLE ONLY public.separado DROP CONSTRAINT separado_pkey;
       public                 postgres    false    223            O           2606    41448    venta venta_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_pkey PRIMARY KEY (id_venta);
 :   ALTER TABLE ONLY public.venta DROP CONSTRAINT venta_pkey;
       public                 postgres    false    221            ^           2606    41482    calzado fk_calzado_marca    FK CONSTRAINT     ~   ALTER TABLE ONLY public.calzado
    ADD CONSTRAINT fk_calzado_marca FOREIGN KEY (marca_id) REFERENCES public.marca(id_marca);
 B   ALTER TABLE ONLY public.calzado DROP CONSTRAINT fk_calzado_marca;
       public               postgres    false    4683    224    218            _           2606    41498    detalleventa fk_detalle_calzado    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalleventa
    ADD CONSTRAINT fk_detalle_calzado FOREIGN KEY (calzado_barra) REFERENCES public.calzado(codigo_barra);
 I   ALTER TABLE ONLY public.detalleventa DROP CONSTRAINT fk_detalle_calzado;
       public               postgres    false    226    4691    224            a           2606    41526 "   detalleseparado fk_detalle_calzado    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalleseparado
    ADD CONSTRAINT fk_detalle_calzado FOREIGN KEY (calzado_barra) REFERENCES public.calzado(codigo_barra);
 L   ALTER TABLE ONLY public.detalleseparado DROP CONSTRAINT fk_detalle_calzado;
       public               postgres    false    4691    224    228            d           2606    41587 %   detallefacturacion fk_detalle_calzado    FK CONSTRAINT     �   ALTER TABLE ONLY public.detallefacturacion
    ADD CONSTRAINT fk_detalle_calzado FOREIGN KEY (calzado_id) REFERENCES public.calzado(codigo_barra);
 O   ALTER TABLE ONLY public.detallefacturacion DROP CONSTRAINT fk_detalle_calzado;
       public               postgres    false    231    224    4691            e           2606    41582 %   detallefacturacion fk_detalle_factura    FK CONSTRAINT     �   ALTER TABLE ONLY public.detallefacturacion
    ADD CONSTRAINT fk_detalle_factura FOREIGN KEY (factura_id) REFERENCES public.facturacion(id_factura);
 O   ALTER TABLE ONLY public.detallefacturacion DROP CONSTRAINT fk_detalle_factura;
       public               postgres    false    229    231    4697            b           2606    41521 #   detalleseparado fk_detalle_separado    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalleseparado
    ADD CONSTRAINT fk_detalle_separado FOREIGN KEY (separado_id) REFERENCES public.separado(id_separado);
 M   ALTER TABLE ONLY public.detalleseparado DROP CONSTRAINT fk_detalle_separado;
       public               postgres    false    228    223    4689            `           2606    41493    detalleventa fk_detalle_venta    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalleventa
    ADD CONSTRAINT fk_detalle_venta FOREIGN KEY (venta_id) REFERENCES public.venta(id_venta);
 G   ALTER TABLE ONLY public.detalleventa DROP CONSTRAINT fk_detalle_venta;
       public               postgres    false    226    221    4687            c           2606    41534     facturacion fk_facturacion_marca    FK CONSTRAINT     �   ALTER TABLE ONLY public.facturacion
    ADD CONSTRAINT fk_facturacion_marca FOREIGN KEY (marca_id) REFERENCES public.marca(id_marca);
 J   ALTER TABLE ONLY public.facturacion DROP CONSTRAINT fk_facturacion_marca;
       public               postgres    false    4683    229    218            ]           2606    41461    separado fk_separado_cliente    FK CONSTRAINT     �   ALTER TABLE ONLY public.separado
    ADD CONSTRAINT fk_separado_cliente FOREIGN KEY (dni_id) REFERENCES public.cliente(dni_cliente);
 F   ALTER TABLE ONLY public.separado DROP CONSTRAINT fk_separado_cliente;
       public               postgres    false    219    4685    223            \           2606    41449    venta fk_venta_cliente    FK CONSTRAINT        ALTER TABLE ONLY public.venta
    ADD CONSTRAINT fk_venta_cliente FOREIGN KEY (dni_id) REFERENCES public.cliente(dni_cliente);
 @   ALTER TABLE ONLY public.venta DROP CONSTRAINT fk_venta_cliente;
       public               postgres    false    221    4685    219            �   D  x���Kn�0�s
.���y,�`J�PR��9j�Z����4�'F�̠�@}��o��!��~�K�՜��A�2�[��.�F��rR���ER��(SP,BeC�)
�$f���մ?�c�}�q|n���ڋv�HcL���aKU�H�v �̀��趹 �D^��C��a�s�h��_�ț��^�}��D��.ȽFA�|]��D��U�;�Z�-"Z�P�Z�<���.�1�j3��MS��p�+t�m	=ݡ+���`�!JHP_�$dW�n�ԥ�������B�����-��]W
�%��� ,����%�ٔ����M���(K      �   &   x�37260640��
����422�0717����� _*�         �   x�]�1� ��w�T����Kյ�?GݡR� çg�T�l��8ǹ�ҕ� ���d+�	�+]�RϤ��j�⿂���
I��K��#�/K�&��2XS�b���_����%G��PD�G������C�            x������ � �             x������ � �         1   x�342�542�4�4202�50�50�rvA02�r�	D0����� Df
_      �   �   x���
�@F��{
� ����Z��6����qFF���v�s���4��XQ!8*�#���8����u5#��5�G��������6t���5��OlEfI;��6��Ю��fE� ��g&�;g�P�����;i��^{'# ?{E2t      �      x������ � �      �      x������ � �     