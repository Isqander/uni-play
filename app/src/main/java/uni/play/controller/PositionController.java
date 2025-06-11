package uni.play.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uni.play.dto.OpenPositionRequest;
import uni.play.dto.OpenPositionResponse;
import uni.play.dto.ClosePositionRequest;
import uni.play.dto.ClosePositionResponse;
import uni.play.service.UniswapService;

@RestController
@RequestMapping("/api/positions")
public class PositionController {

    private final UniswapService uniswapService;

    public PositionController(UniswapService uniswapService) {
        this.uniswapService = uniswapService;
    }

    @PostMapping("/open")
    public ResponseEntity<OpenPositionResponse> open(@RequestBody OpenPositionRequest request) {
        String tx = uniswapService.openPosition(request);
        return ResponseEntity.ok(new OpenPositionResponse(tx));
    }

    @PostMapping("/close")
    public ResponseEntity<ClosePositionResponse> close(@RequestBody ClosePositionRequest request) {
        String tx = uniswapService.closePosition(request);
        return ResponseEntity.ok(new ClosePositionResponse(tx));
    }
}
