package homework2;

public class Part_3 {
    public static void main(String[] args)
    {
        class Phone
        {
            private String _model;
            private int _price;
            private String _produced;

            Phone(String model, String produced)
            {
                this._model = model;
                this._produced = produced;
            }

            void setPrice(int price)
            {
                this._price = price;
            }

            public int get_price()
            {
                return _price;
            }
            public String get_produced()
            {
                return _produced;
            }
            public String get_model()
            {
                return _model;
            }

            public String getPhone()
            {
                return _model   + ", " +
                        _price  + ", " +
                        _produced + " \n";
            }

            public String toString()
            {
                return getPhone();
            }
        }

        Phone phone1 = new Phone("iPhone", "USA");
        phone1.setPrice(1100);
        Phone phone2 = new Phone("Samsung", "China");
        phone2.setPrice(750);
        Phone phone3 = new Phone("Nokia", "Finland");
        phone3.setPrice(435);

        System.out.println("Phone1: " + phone1 + "Phone2: " + phone2 + "Phone3: " + phone3);
    }
}



