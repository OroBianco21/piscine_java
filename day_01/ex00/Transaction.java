//package day_01.ex00;

import java.util.UUID;

public class Transaction {
	
	private final UUID id;
    private User recipient;
    private User sender;
    private int moneyToTransfer;
	private Category debitOrCredit;

	enum Category {
        DEBIT,
		CREDIT
    }

	public Transaction(User recipient, User sender, int moneyToTransfer, Category debitOrCredit) {
		this.id = UUID.randomUUID();
		this.recipient = recipient;
		this.sender = sender;
		this.debitOrCredit = debitOrCredit;
		manageTransfer(moneyToTransfer);
	}

	public void manageTransfer(int moneyToTransfer) {
		if (debitOrCredit == Category.CREDIT) {
			if (sender.getBalance() >= moneyToTransfer && moneyToTransfer > 0) {
				this.moneyToTransfer = moneyToTransfer;
				setNewBalance(moneyToTransfer);
			} else {
				this.moneyToTransfer = 0;
			}
		} else {
			if (recipient.getBalance() >= moneyToTransfer && moneyToTransfer > 0) {
				this.moneyToTransfer = moneyToTransfer;
				setNewBalance(moneyToTransfer);
			} else {
				this.moneyToTransfer = 0;
			}
		}
	}

	public void setNewBalance(int moneyToTransfer) {
		if (debitOrCredit == Category.CREDIT) {
			recipient.setBalance(recipient.getBalance() + moneyToTransfer);
			sender.setBalance(sender.getBalance() - moneyToTransfer);
		} else {
			sender.setBalance(sender.getBalance() + moneyToTransfer);
			recipient.setBalance(recipient.getBalance() - moneyToTransfer);
		}
	}

	public UUID id() {
        return id;
    }

	public int moneyToTransfer() {
        return moneyToTransfer;
    }

	@Override
    public String toString() {
        return "Transaction: " + 
		"\nId = " + id + 
		"\nRecipient = " + recipient.getName() + 
		"\nSender = " + sender.getName() + 
		"\nMoney To Transfer = " + moneyToTransfer + 
		"\nDebit Or Credit = " + debitOrCredit +
		"\nNew Balance Recipient = " + recipient.getBalance() +
		"\nNew Balance Sender = " + sender.getBalance() +
		"\n";
    }
}