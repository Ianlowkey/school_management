package za.ac.cput.schoolmanagement.domain.lookup;

/*
 @Author: Lihle Njobe
 Student number : 218193882
 This is Country domain class
 Due date: 18 June 2022
 */

import javax.persistence.Entity;

@Entity
    public class Country {

        private String id;
        private String name;

        private Country () {}

        private Country(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public String getId() {

            return id;
        }

        public String getName() {

            return name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Country{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
        public static class Builder {
            private String id;
            private String name;

            public Builder setId(String id) {
                this.id = id;
                return this;
            }

            public Builder setName(String name) {
                this.name = name;
                return this;
            }
            public Builder copy (Country country) {
                this.id = country.id;
                this.name = country.name;
                return this;

            }
            public Country build() {

                return new Country (this);
            }
        }
    }


