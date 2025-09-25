class Beneficiary {
         
        private String name;
        private int age;
        private String gender;
        private String address;
        private String contactInfo;
        private String organization;
        private String need;
        private String status;
        private String assistanceReceived;
            
    public Beneficiary() {
           
        this.name =  "no name";
        this.age = 0;
        this.gender = "no gender";
        this.address = "no address";
        this.contactInfo = "no contact info";
        this.organization = "no organization";
        this.need = "no need";
        this.status = "no status";
        this.assistanceReceived = "no assistance received";
            
    }    
    public Beneficiary(String name,int age, String gender,String address,String contactInfo,String organization,String need,String status,String assistanceReceived) {
        
        this.name =  name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactInfo = contactInfo;
        this.organization = organization;
        this.need = need;
        this.status = status;
        this.assistanceReceived = assistanceReceived;
    }        

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
         return gender;
    }
    public String getAddress() {
         return address;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public String getOrganization() {
        return organization;
    }
    public String getNeed() {
        return need;
    }
     public String getStatus() {
        return status;
    }
    public String getAssistanceReceived() {
        return assistanceReceived;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public void setNeed(String need) {
        this.need = need;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setAssistanceReceived(String assistanceReceived) {
        this.assistanceReceived = assistanceReceived;
    }
    public void displayInfo() {
        String info = "";
        info += "Name: " + name + "\n";
        info += "Age: " + age + "\n";
        info += "Gender: " + gender + "\n";
        info += "Address: " + address + "\n";
        info += "Contact Info: " + contactInfo + "\n";
        info += "Organization: " + organization + "\n";
        info += "Need: " + need + "\n";
        info += "Status: " + status + "\n";
        info += "Assistance Received: " + assistanceReceived + "\n";
        System.out.println(info);
          
    }
}

   class Volunteer {

        private String name;
        private int age;
        private String contactNumber;
        private String skills;
        private int hoursServed;

        public Volunteer() {
            this.name = "no name";
            this.age = 0;
            this.contactNumber = "no contact number";
            this.skills = "no skills";
            this.hoursServed = 0;
        }   
        public Volunteer(String name, int age, String contactNumber, String skills, int hoursServed) {
            this.name = name;
            this.age = age;
            this.contactNumber = contactNumber;
            this.skills = skills;
            this.hoursServed = hoursServed;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getContactNumber() {
            return contactNumber;
        }
        public String getSkills() {
            return skills;
        }
        public int getHoursServed() {
            return hoursServed;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }
        public void setSkills(String skills) {
            this.skills = skills;
        }
        public void setHoursServed(int hoursServed) {
            this.hoursServed = hoursServed;
        }

        public void displayInfo() {
            String info = "";
            info += "Name: " + name + "\n";
            info += "Age: " + age + "\n";
            info += "Contact Number: " + contactNumber + "\n";
            info += "Skills: " + skills + "\n";
            info += "Hours Served: " + hoursServed + "\n";
            System.out.println(info);
        }   

    }

    class Admin {

        private String username;
        private String password;
        private String fullName;
        private String email;
        private String role;


    public Admin() {
            this.username = "no username";
            this.password = "no password";
            this.fullName = "no full name";
            this.email = "no email";
            this.role = "no role"; 
        }

    public Admin(String username, String password, String fullName, String email, String role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getRole() {
        return role;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void displayInfo() {
        String info = "";
        info += "Username: " + username + "\n";
        info += "Password: " + password + "\n";
        info += "Full Name: " + fullName + "\n";
        info += "Email: " + email + "\n";
        info += "Role: " + role + "\n";
        System.out.println(info);
    }

}
