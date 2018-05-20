package final_project.services;

import final_project.dao.OrderDAO;

import java.util.Date;

public class OrderService {
    private OrderDAO orderDAO = new OrderDAO();

    public void bookRoom(long roomId, long userId) throws Exception {
        orderDAO.addOrder(roomId, userId, new Date(), new Date(), 0);
    }

    public void cancelReservation(long roomId, long userId) throws Exception {
        orderDAO.delete(roomId, userId);
    }

}
