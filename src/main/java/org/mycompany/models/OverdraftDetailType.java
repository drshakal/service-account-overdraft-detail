package org.mycompany.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="overdraft_detail")
public class OverdraftDetailType {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
        protected int id;
	    
	    @Column(name="overdraft_start_date1")
		protected String overdraftStartDate1;
	    @Column(name="overdraft_start_date2")
	    protected String overdraftStartDate2;
	    @Column(name="overdraft_start_date3")
	    protected String overdraftStartDate3;
	    @Column(name="overdraft_start_date4")
	    protected String overdraftStartDate4;
	    @Column(name="overdraft_end_date1")
	    protected String overdraftEndDate1;
	    @Column(name="overdraft_end_date2")
	    protected String overdraftEndDate2;
	    @Column(name="overdraft_end_date3")
	    protected String overdraftEndDate3;
	    @Column(name="overdraft_end_date4")
	    protected String overdraftEndDate4;
	    
	    
	    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    protected MoneyOptional overdraftAmount1;
	    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    protected MoneyOptional overdraftAmount2;
	    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    protected MoneyOptional overdraftAmount3;
	    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    protected MoneyOptional overdraftAmount4;
	    
		public String getOverdraftStartDate1() {
			return overdraftStartDate1;
		}
		public void setOverdraftStartDate1(String overdraftStartDate1) {
			this.overdraftStartDate1 = overdraftStartDate1;
		}
		public String getOverdraftStartDate2() {
			return overdraftStartDate2;
		}
		public void setOverdraftStartDate2(String overdraftStartDate2) {
			this.overdraftStartDate2 = overdraftStartDate2;
		}
		public String getOverdraftStartDate3() {
			return overdraftStartDate3;
		}
		public void setOverdraftStartDate3(String overdraftStartDate3) {
			this.overdraftStartDate3 = overdraftStartDate3;
		}
		public String getOverdraftStartDate4() {
			return overdraftStartDate4;
		}
		public void setOverdraftStartDate4(String overdraftStartDate4) {
			this.overdraftStartDate4 = overdraftStartDate4;
		}
		public String getOverdraftEndDate1() {
			return overdraftEndDate1;
		}
		public void setOverdraftEndDate1(String overdraftEndDate1) {
			this.overdraftEndDate1 = overdraftEndDate1;
		}
		public String getOverdraftEndDate2() {
			return overdraftEndDate2;
		}
		public void setOverdraftEndDate2(String overdraftEndDate2) {
			this.overdraftEndDate2 = overdraftEndDate2;
		}
		public String getOverdraftEndDate3() {
			return overdraftEndDate3;
		}
		public void setOverdraftEndDate3(String overdraftEndDate3) {
			this.overdraftEndDate3 = overdraftEndDate3;
		}
		public String getOverdraftEndDate4() {
			return overdraftEndDate4;
		}
		public void setOverdraftEndDate4(String overdraftEndDate4) {
			this.overdraftEndDate4 = overdraftEndDate4;
		}
		public MoneyOptional getOverdraftAmount1() {
			return overdraftAmount1;
		}
		public void setOverdraftAmount1(MoneyOptional overdraftAmount1) {
			this.overdraftAmount1 = overdraftAmount1;
		}
		public MoneyOptional getOverdraftAmount2() {
			return overdraftAmount2;
		}
		public void setOverdraftAmount2(MoneyOptional overdraftAmount2) {
			this.overdraftAmount2 = overdraftAmount2;
		}
		public MoneyOptional getOverdraftAmount3() {
			return overdraftAmount3;
		}
		public void setOverdraftAmount3(MoneyOptional overdraftAmount3) {
			this.overdraftAmount3 = overdraftAmount3;
		}
		public MoneyOptional getOverdraftAmount4() {
			return overdraftAmount4;
		}
		public void setOverdraftAmount4(MoneyOptional overdraftAmount4) {
			this.overdraftAmount4 = overdraftAmount4;
		}
	    
	    
}
