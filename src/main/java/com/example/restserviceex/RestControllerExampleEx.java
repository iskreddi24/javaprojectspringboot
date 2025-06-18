package com.example.restserviceex;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExampleEx {

    @GetMapping(path = "/get/mapping")
    public String getMapping(){
        return "hello";
    }
    @GetMapping(path = "/get/bankcoustmer")
    public Bank returnCoustmerDetails() {
        Bank bank=new Bank();
        Details details=new Details();
        details.setCoustmerName("harish rao");

        Family family=new Family();
        family.setFatherName("sankarayya");
        family.setMotherName("srivalli");

        MartialStatus martialStatus=new MartialStatus();
        martialStatus.setStatusOfCoustmer("unmarried");
        family.setMartialStatus(martialStatus);
        details.setFamily(family);
        bank.setDetails(details);
        LoanDetails loanDetails=new LoanDetails();
        loanDetails.setCarLoan(0);
        loanDetails.setGoldLoan(0);
        loanDetails.setHouseLoan(24);
        bank.setLoanDetails(loanDetails);
        Addresss addresss=new Addresss();
        addresss.setDistrict("prakasam");
        State state=new State();
        state.setStateCode(520007);
        state.setStateName("andhra pradesh");
        addresss.setHouseNo("4-106d");
        addresss.setStreetName("ganapathistreer");
        addresss.setVillage("jammalamadugu");
        addresss.setState(state);
        bank.setAddresss(addresss);
        Contacts conatcts=new Contacts();
        conatcts.setEmail("randomemailgooods@gamail.com");
        conatcts.setPhoneNumber(4535543);
        bank.setContacts(conatcts);
        return bank;
    }

    @PostMapping(path = "/update/bankcustomer")
    public String updateBankDetails(@RequestBody Bank bank){
        System.out.println(bank);
        // Guntur 8.25
        //Prakasam 8.9
        //Krishna : 9.25
        Addresss addresss=new Addresss();
        String district = bank.getAddresss().getDistrict();
        switch (district) {
            case "prakasam":
                return "Your interest rate is 8.25";
            case "guntur":
                return "Your interest rate is 8.9";
            case "krishna":
                return "Your interest rate is 9.25";
            default:
                return "Your interest rate is 8.6";
        }

    }

    @PostMapping(path = "update/system")
    public String updateString(@RequestBody Bank bank){
        System.out.println(bank);
        Details details=new Details();
        String coustmerName=bank.getDetails().getCoustmerName();
        String s=coustmerName.toUpperCase();
        return s;
    }
    @PostMapping(path = "update/villages")
    public String updateStringVillage(@RequestBody Bank bank){
        System.out.println(bank);
        Details details=new Details();
        String coustmerName=bank.getDetails().getCoustmerName().toUpperCase();
        Addresss addresss=new Addresss();
        String village=bank.getAddresss().getVillage();
        String x=village.concat(" palem").toUpperCase();
        return ("Mr "+coustmerName+" yor are from "+x).toUpperCase();
    }
    @PostMapping(path = "/update/substring")
    public String updateSubString(@RequestBody Bank bank){
        System.out.println(bank);
        Details details=new Details();
        String fatherName=bank.getDetails().getFamily().getFatherName();
        String y=fatherName.substring(1,3);
        return y;
    }
    @PostMapping(path = "update/ignorecase")
    public String updateStringIgnore(@RequestBody Bank bank){
        System.out.println(bank);
        Details details=new Details();
        String coustmerName=bank.getDetails().getCoustmerName();
        String n="RAMA RAO";
        if(n.equalsIgnoreCase(coustmerName)){
            return coustmerName.concat(" NAIDU").toUpperCase();
        }
        else {
            return coustmerName.toUpperCase();
        }
    }
}
