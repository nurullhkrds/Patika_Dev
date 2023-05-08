/*
Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
 */

public class Employee {
    String name;
    double maas;
    double haftalikCalismaSaati;
    int iseBaslangicYili;
    Employee(String name,double maas,double haftalikCalismaSaati,int iseBaslangicYili){
        this.name=name;
        this.maas=maas;
        this.haftalikCalismaSaati=haftalikCalismaSaati;
        this.iseBaslangicYili=iseBaslangicYili;
    }



    double raiseSalary(){
        if ((2021-iseBaslangicYili)<10){
            return this.maas*0.5;
        }
        else if ((2021-iseBaslangicYili)>9 && (2021-iseBaslangicYili)<19) {
            return this.maas*0.10;
        }
        else {
            return this.maas*0.15;
        }

    }


    double bonus(){
        if(haftalikCalismaSaati>40){
            return (haftalikCalismaSaati-40)*30;
        }
        else
        {
            return 0;
        }

    }

    double vergi(){
        if (this.maas>1000){
            return this.maas*0.03;
        }
        else
        {
            return 0;
        }
    }
    void toStringg(){
        System.out.println("İsim:"+this.name
        +" \n Maaş: "+ maas+"\n Çalışma Saati: "+haftalikCalismaSaati+
                "\n İşe Başlama Tarihi: "+ iseBaslangicYili+
                "\n Vergi: "+vergi()+
                "\n Bonus :"+bonus()+
                "\n Maaş Artışı: "+raiseSalary()+
                "\n Vergi ve Bonuslar dahil Maaş: "+(maas+bonus()-vergi())+
                "\n Toplam maas: "+(maas+bonus()-vergi()+raiseSalary()) );

    }

}
